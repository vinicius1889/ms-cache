package br.com.icarros.services;

import br.com.icarros.enums.EnumListName;
import br.com.icarros.enums.EnumMapName;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IList;
import com.hazelcast.core.IMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IcarrosCacheService {

    @Autowired
    private HazelcastInstance hz;


    @Deprecated
    public HazelcastInstance getHazelcastInstance(){
        return this.hz;
    }

    public IList getList(Enum listName){
        return this.hz.getList(listName.toString());
    }

    public IMap getMap(Enum mapName){
        return this.hz.getMap(mapName.toString());
    }




}
