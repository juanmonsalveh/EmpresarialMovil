package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by samsung on 08/06/2015.
 */
public class LongList extends Vector<Long> implements KvmSerializable {

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
        this.add(Long.parseLong(o.toString()));
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo info) {
        info.name="nombre elemen";
        info.type=Long.class;
    }
}
