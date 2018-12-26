/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbpackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jojoj
 */
public class dbclass {
    public Connection con=null;
    public dbclass()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/db_ids","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbclass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbclass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int createdataset()
    {
        int i=0;
        try {
            dbclass db=new dbclass();
            Statement st=db.con.createStatement();
            
            File file=new File("F:\\Project\\Intrusion_Detection_System_MA\\train.csv");
            file.createNewFile();
            
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            
            bw.write("duration,protocol_type,service,flag,src_bytes,dst_bytes,land,wrong_fragntinuous,urgent,hot,num_failed_logins,logged_in,num_compromised,root_shell,su_attempted,num_root,num_file_creations,num_shells,num_access_files,num_outbound_cmds,is_host_login,is_guest_login,count,srv_count,serror_rate,srv_serror_rate,rerror_rate,srv_rerror_rate,same_srv_rate,diff_srv_rate,srv_diff_host_rate,dst_host_count,dst_host_srv_count,dst_host_same_srv_rate,dst_host_diff_srv_rate,dst_host_same_src_port_rate,dst_host_srv_diff_host_rate,dst_host_serror_rate,dst_host_srv_serror_rate,dst_host_rerror_rate,dst_host_srv_rerror_rate,class");
            
            ResultSet rs=st.executeQuery("select * from `table 7`");
            while(rs.next())
            {
                String d1=rs.getString("duratio");
                String d2=rs.getString("protocol_type");
                String d3=rs.getString("service");
                String d4=rs.getString("flag");
                String d5=rs.getString("src_bytes");
                String d6=rs.getString("dst_bytes");
                String d7=rs.getString("land");
                String d8=rs.getString("wrong_fragntinuous");
                String d9=rs.getString("urgent");
                String d10=rs.getString("hot");
                String d11=rs.getString("num_failed_logins");
                String d12=rs.getString("logged_in");
                String d13=rs.getString("num_compromised");
                String d14=rs.getString("root_shell");
                String d15=rs.getString("su_attempted");
                String d16=rs.getString("num_root");
                String d17=rs.getString("num_file_creations");
                String d18=rs.getString("num_shells");
                String d19=rs.getString("num_access_files");
                String d20=rs.getString("num_outbound_cmds");
                String d21=rs.getString("is_host_login");
                String d22=rs.getString("is_guest_login");
                String d23=rs.getString("count");
                String d24=rs.getString("srv_count");
                String d25=rs.getString("serror_rate");
                String d26=rs.getString("srv_serror_rate");
                String d27=rs.getString("rerror_rate");
                String d28=rs.getString("srv_rerror_rate");
                String d29=rs.getString("same_srv_rate");
                String d30=rs.getString("diff_srv_rate");
                String d31=rs.getString("srv_diff_host_rate");
                String d32=rs.getString("dst_host_count");
                String d33=rs.getString("dst_host_srv_count");
                String d34=rs.getString("dst_host_same_srv_rate");
                String d35=rs.getString("dst_host_diff_srv_rate");
                String d36=rs.getString("dst_host_same_src_port_rate");
                String d37=rs.getString("dst_host_srv_diff_host_rate");
                String d38=rs.getString("dst_host_serror_rate");
                String d39=rs.getString("dst_host_srv_serror_rate");
                String d40=rs.getString("dst_host_rerror_rate");
                String d41=rs.getString("dst_host_srv_rerror_rate");
                String d42=rs.getString("class");
                
                bw.write("\n");
                bw.write(d1+","+d2+","+d3+","+d4+","+d5+","+d6+","+d7+","+d8+","+d9+","+d10+","+d11+","+d12+","+d13+","+d14+","+d15+","+d16+","+d17+","+d18+","+d19+","+d20+","+d21+","+d22+","+d23+","+d24+","+d25+","+d26+","+d27+","+d28+","+d29+","+d30+","+d31+","+d32+","+d33+","+d34+","+d35+","+d36+","+d37+","+d38+","+d39+","+d40+","+d41+","+d42);
                i++;
            }
            bw.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbclass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(dbclass.class.getName()).log(Level.SEVERE, null, ex);
        }
        return i;
    }
}
