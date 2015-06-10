package model;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by juanmonsalveh on 10/06/15.
 */
public class CurricularProgramList extends Vector<CurricularProgramVO> implements KvmSerializable {
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
        this.add((CurricularProgramVO) o);
    }

    @Override
    public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo info) {
        info.name="nombre elemen";
        info.type=CurricularProgramVO.class;
    }
}
