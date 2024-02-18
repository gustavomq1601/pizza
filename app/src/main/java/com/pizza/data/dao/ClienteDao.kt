import androidx.room.*
import com.pizza.data.model.Cliente

@Dao
interface ClienteDao {

    @Query("SELECT * FROM cliente WHERE email = :email")
    fun getCliente(email: String): Cliente

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveCliente(cliente: Cliente)
}
