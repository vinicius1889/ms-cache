package br.com.icarros.configs;


import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientConnectionStrategyConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Value("${icarros.cluster.cache.name}")
    private String name;
    @Value("${icarros.cluster.cache.pass}")
    private String pass;

    @Bean
    public HazelcastInstance getHazelCastInstance(){
        ClientConnectionStrategyConfig clientConn = new ClientConnectionStrategyConfig();
        clientConn.setAsyncStart(true);
        clientConn.setReconnectMode(ClientConnectionStrategyConfig.ReconnectMode.ASYNC);

        GroupConfig groupConfig = new GroupConfig();
        groupConfig.setName(this.name);
        groupConfig.setPassword(this.pass);

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.setConnectionStrategyConfig(clientConn);
        clientConfig.setGroupConfig(groupConfig);

        return HazelcastClient.newHazelcastClient(clientConfig);

    }


}
