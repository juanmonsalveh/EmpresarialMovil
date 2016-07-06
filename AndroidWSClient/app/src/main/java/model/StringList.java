package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by juanmonsalveh on 11/06/15.
 */
public class StringList  extends Vector<String> implements KvmSerializable {
    @Override
    public Object getProperty(int i) {
        return this.getProperty(i);
    }

    @Override
    public int getPropertyCount() {
        return this.size();
    }

    @Override
    public void setProperty(int i, Object o) {
        this.add(o.toString());
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo info) {
        info.name="nombre elemen";
        info.type=String.class;
    }
}
