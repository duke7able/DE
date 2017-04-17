package ga.rdxgeek.de;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Shreyan on 4/12/2017.
 */
@Table(name = "user")
public class tablePOJO extends Model {
    @Column(name = "name")
    public String Name;
    @Column(name = "trustedPerson")
    public Integer tp;
    @Column(name = "email")
    public String email;
    @Column(name = "pass")
    public String password;

    tablePOJO(){
        Name = "";
        tp = 0;
        email = "";
        password = "";
    }
    public static List<tablePOJO>selectStarQuery(){
        return new Select().from(tablePOJO.class).execute();
    }


}
