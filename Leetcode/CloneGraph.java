/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        return helper(map, node);
    }
    
    public UndirectedGraphNode helper(HashMap<UndirectedGraphNode, UndirectedGraphNode> map, UndirectedGraphNode node) {
        if (node == null)
            return null;
        
        if (map.containsKey(node))
            return map.get(node);
        
        UndirectedGraphNode add = new UndirectedGraphNode(node.label);
        map.put(node, add);
        
        for (UndirectedGraphNode temp: node.neighbors)
            add.neighbors.add(helper(map, temp));
        
        return add;
    }
}