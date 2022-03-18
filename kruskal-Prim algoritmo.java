 public static Graph PrimsAlgorithm(Graph g,ints){
    int n = g.getNumberOfVertices();
    Entry[] table = new Entry[n];
    for(int v = 0;v < n; v++)
      table[v] = new Entry();
    table[g].distance = 0;
    PriorityQueue queue = new BinaryHeap(g.getNumberOfEdges());
    queue.enqueue(new Association(new Int (0),g.getVertex(g)));
    while(!queue.isEmpty()){
      Association assoc = (Association)queue.dequeueMin();
      Vertex v0 = (Vertex) assoc.getValue();
      int n0 = v0.getNumber();
      if(!table[n0].known){
        table[n0].known =true;
        Enumeration p = v0.getEmanatingEdges();
        while(p.hasMoreElements()){
          Edge edge = (Edge)p.nextElement();
          Vertex v1 = edge.getMate(v0);
          int n1 = v1.getNumber();
          int wt = (Int) edge.getWeight();
          int d = wt.intValue();
          if(table[n1].distance > d){
            table[n1].distance = d;
            table[n1].predecessor = n0;
            queue.enqueue(new Association(new Int(d),v1))
          }
        }
      }
    }
    Graph result = new GraphAsLists(n);
    for (int v = 0; v < n; v++)
      result.addVertex(v);
    for(int v = 0; v < n; v++)
      if(v != g)
        result.addEdge(v, table[v].predecessor);
    return result;
  } 
public static Graph KruskalAlgorithm(Graph g){
  int n = g.getNumberOfVertices();
  Graph result = new GraphAsLists(n);
  for(v = 0; v < n; v++)
    result.addVertex(v);
  PriorityQueue queue = new BinaryHeap(g.getNumberOfEdges());
  Enumeration p = g.getEdges();
  while(p.hasMoreElements()){
    Edge edge = (Edge)p.nextElement();
    int weight = (Int)edge.getWeight();
    queue.enqueue(new Association(weight, edge));
  }
  Partition partition = new PartitionAsForest(n);
 while(!queue.isEmpty() && partition.getCount() > 1){
   Association assoc = (Association)queue.dequeueMin();
   Edge edge = (Edge) assoc.getValue();
   int n0 = edge.getV0().getNumber();
   int n1 = edge.getV1().getNumber();
   Set s  = partition.find(n0);
   Set t  = partition.find(n1);
   if(g != t){
     partition.join(g,t);
     result.addEdge(n0,n1);
   }
 }
  return result;
}
}
