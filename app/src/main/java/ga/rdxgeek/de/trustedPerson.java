package ga.rdxgeek.de;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Shreyan on 4/17/2017.
 */
@Table(name = "trustedPerson")
public class trustedPerson extends Model {
    @Column(name = "tpID")
    public Integer tp;
    @Column(name = "name")
    public String Name;
    @Column(name = "phone")
    public Integer phone;
    trustedPerson(){
        Name = "";
        tp = 0;
        phone = 0;
}
}
