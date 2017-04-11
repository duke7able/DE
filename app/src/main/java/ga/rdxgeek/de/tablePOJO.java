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
    public String name;
    @Column(name = "username")
    public String username;
    @Column(name = "email")
    public String email;
    @Column(name = "password")
    public String password;

    public static List<tablePOJO>selectStarQuery(){
        return new Select().from(tablePOJO.class).execute();
    }


}
