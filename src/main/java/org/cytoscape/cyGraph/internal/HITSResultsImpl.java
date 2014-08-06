/**
 * 
 */
package org.cytoscape.cyGraph.internal;

import java.util.Map;

import org.cytoscape.cyGraph.algorithms.api.HITSResults;
import org.cytoscape.model.CyNode;

/**
 * @author Jimmy
 *
 */
public class HITSResultsImpl implements HITSResults{

	private double authority[];
	
	private double hubs[];
	
	private Map<CyNode, Integer> nodeIndexMap;
	
	public HITSResultsImpl(double authority[], double hubs[], Map<CyNode, Integer> nodeIndexMap){
		
		this.authority = authority;
		this.hubs = hubs;
		this.nodeIndexMap = nodeIndexMap;
	}
	
	@Override
	public double getHubValue(CyNode node) {
		// TODO Auto-generated method stub
		return hubs[nodeIndexMap.get(node)];
	}

	@Override
	public double getAuthorityValue(CyNode node) {
		// TODO Auto-generated method stub
		return authority[nodeIndexMap.get(node)];
	}

}
