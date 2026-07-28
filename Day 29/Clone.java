class Solution {
    private Map<Node, Node> visitedNodes = new HashMap<>();
    public Node cloneGraph(Node node) {
        return deepFirstSearch(node);
    }
    private Node deepFirstSearch(Node node) {
        if (node == null) {
            return null;
        }
        Node clonedNode = visitedNodes.get(node);
        if (clonedNode == null) {
            clonedNode = new Node(node.val);
            visitedNodes.put(node, clonedNode);
            for (Node neighbor : node.neighbors) {
                clonedNode.neighbors.add(deepFirstSearch(neighbor));
            }
        }
        return clonedNode;
    }
}