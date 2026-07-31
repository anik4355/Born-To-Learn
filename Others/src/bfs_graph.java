import java.util.*;
public class bfs_graph {
   public static void main(String[] args) {
       int n = 6;
       ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();
       for(int i =0 ; i<n; i++){
        graph.add(new ArrayList<>());
       }
       graph.get(0).add(1);
       graph.get(0).add(2);

   } 
   public static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited){
    visited[node] =true;
    System.out.println(node + " ");
    for(int neighbour : graph.get(node)){
        if(!visited[neighbour]){
            dfs(graph, neighbour, visited);
        }
    }
   }
   public static void bfs(int start, ArrayList<ArrayList<Integer>> graph, int n){
    boolean[] visited = new boolean[n];
    Queue<Integer> qu = new LinkedList<>();
    qu.offer(start);
    visited[start] = true;

   }
}
