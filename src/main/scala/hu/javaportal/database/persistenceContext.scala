package hu.javaportal.database

import net.fwbrasil.activate.ActivateContext
import net.fwbrasil.activate.storage.relational.PooledJdbcRelationalStorage
import net.fwbrasil.activate.storage.relational.idiom.h2Dialect

/**
 * Created by b0c1 on 2015.09.09..
 */
object persistenceContext extends ActivateContext {
  val storage = new PooledJdbcRelationalStorage {
    val jdbcDriver = "org.h2.Driver"
    val user = Some("sa")
    val password = Some("")
    val url = "jdbc:h2:mem:my_database;DB_CLOSE_DELAY=-1"
    val dialect = h2Dialect
  }
}
