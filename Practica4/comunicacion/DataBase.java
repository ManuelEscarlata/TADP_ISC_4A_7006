package comunicacion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataBase {
    Connection c=null;
    Statement sentencia=null;
    String nombreTabla;
    private ResultSet resultSet = null;
    private Statement statement = null;
    public void conectar(){
   
        try{
            Class.forName("org.sqlite.JDBC");
            c=DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Exito al conectar con base de datos");
        }catch(Exception e){
            System.out.println("Error al conectar con base de datos");
        }

    }
    public void crearTabla(String nombreTabla) throws SQLException{
        this.nombreTabla=nombreTabla;
        try{
            sentencia=c.createStatement();
            String sql="CREATE TABLE "+nombreTabla+" "+
                    "(Id INT NOT NULL,"+
                    " Nombre TEXT NOT NULL,"+
                    " Edad INT NOT NULL)";
            sentencia.execute(sql);
            sentencia.close();
            c.close();
            System.out.println("Exito al crear la tabla");
        }catch(Exception e){
            System.out.println("Error al crear la tabla o que ya estaba creada");
        }
    }
    public boolean insert(String table, String values)
    {
        boolean res=false;
        //Se arma la consulta
        String q=" INSERT INTO " + table +" VALUES ( " + values + " ) ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm  = c.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res=true;
         }catch(Exception e){
            System.out.println(e);
        }
      return res;
    }
    public String select()
    {
        String res=" ID | Nombre | Edad \n ";
        try {
            statement = c.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM "+nombreTabla+";");
            while (resultSet.next())
            {
                res+=resultSet.getString("Id") + " | " + resultSet.getString("Nombre") + " | " +  resultSet.getString("Edad") + " \n ";
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        return res;
    }
    /*public static void main(String[] args) {
        DataBase  miBaseDb=new DataBase();
        miBaseDb.conectar();
        try {
            miBaseDb.crearTabla("Jugadores2");
            miBaseDb.insert("Jugadores2","'1' , 'MANUEL' ,'24'");
            System.out.println(miBaseDb.select());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/
}
