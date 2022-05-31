

public class Network_Graph {
	
	private static UndirectedGraph<Profile> graph = new UndirectedGraph<>();
	private static StackInterface<Profile> path = new LinkedStack<>();
	Profile[] names=new Profile[10];
	Profile[] rname=new Profile[10];
	Profile Ria = new Profile();
	Profile Annie = new Profile();
	Profile Bob = new Profile();
	Profile Nandhini = new Profile();
	Profile Amy = new Profile();
	Profile Joe = new Profile();
	Profile Ron = new Profile();
	Profile Harry = new Profile();
	Profile Ariel = new Profile();
	Profile Pooh = new Profile();
	double pathlen=0.0;
	
    public void Network() {
    	
    	names[0]=Ria;
    	names[1]=Annie;
    	names[2]=Bob;
    	names[3]=Nandhini;
    	names[4]=Amy;
    	names[5]=Joe;
    	names[6]=Ron;
    	names[7]=Harry;
    	names[8]=Ariel;
    	names[9]=Pooh;
    	
    	graph.addVertex(Ria);
    	graph.addVertex(Annie);
    	graph.addVertex(Bob);
    	graph.addVertex(Nandhini);
    	graph.addVertex(Amy);
    	graph.addVertex(Joe);
    	graph.addVertex(Ron);
    	graph.addVertex(Harry);
    	graph.addVertex(Ariel);
    	graph.addVertex(Pooh);
    	
    	graph.addEdge(Ria, Annie,1);
    	graph.addEdge(Ria, Nandhini,1);
    	graph.addEdge(Ria, Ariel,1);
    	graph.addEdge(Ria, Pooh,1);
    	graph.addEdge(Ron, Annie,1);
    	graph.addEdge(Bob, Annie,1);
    	graph.addEdge(Bob, Amy,1);
    	graph.addEdge(Harry, Amy,1);
    	graph.addEdge(Harry, Joe,1);
    	graph.addEdge(Nandhini, Joe,1);
    	graph.addEdge(Nandhini, Pooh,1);
    	graph.addEdge(Ron, Ariel,1);
    	graph.addEdge(Bob, Ariel,1);
    	
    	
    	
    	
    }
    
    public void recommend() {
    	int c=0;
    	for(int i=0; i<10;i++)
    	{ pathlen= graph.getCheapestPath(Ria, names[i], path);
    	 if(pathlen==2.0)
     	{
     		rname[c]=names[i];
     		c++;
     	}
     	
    	}
    
    	System.out.println("Recommended friends: ");
    	for(int i=0;i<10;i++) {
    		if(rname[i]!=null) {
    			System.out.print(rname[i]+", ");
    		}
    	}
    }

}
