package hellonew;
import java.util.*;


public class mit 
{
	static class graph
	{
		int v;
		LinkedList<Integer> adjlist[];
		graph(int V)
		{
			this.v=V;
			adjlist = new LinkedList[v];
			for(int i =0;i<v;i++)
			{
				adjlist[i]= new LinkedList<>();
			}
		}
	}
	
	static void addEdge(graph G, int src , int dest)
	{
		G.adjlist[src].add(dest);
		G.adjlist[dest].add(src);
		
	}
	
	static void printing (graph G)
	{
		for(int u = 0 ; u<G.v ; u++) {
			System.out.println("\n");
		for(int p : G.adjlist[u])
			System.out.print(p+"-->");
		System.out.println("\n");
	}}
	public static void main(String[] args)
	{
		int V =5;
		graph G = new graph(V);
		addEdge(G, 0, 1); 
        addEdge(G, 0, 4); 
        addEdge(G, 1, 2); 
        addEdge(G, 1, 3); 
        addEdge(G, 1, 4); 
        addEdge(G, 2, 3); 
        addEdge(G, 3, 4); 
        
        printing(G);
		
	}
}
	
	


