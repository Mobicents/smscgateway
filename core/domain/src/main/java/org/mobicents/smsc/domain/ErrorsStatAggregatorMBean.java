package org.mobicents.smsc.domain;

import java.util.List;
import java.util.Map;

public interface ErrorsStatAggregatorMBean {

    List<String> getCountersByGroup(String group);
    
    /** @return
     * clusterName --> 'Cluster' -> counterName
     *             |
     *             --> 'ESME' -> counters (1 per Esme)
     *             |
     *             --> 'Session' -> counters (1 per Esme)
     */
    Map<String, Map<CounterGroup, List<String>>> getAllCountersPerCluster();
}
