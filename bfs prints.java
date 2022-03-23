public void breadthFirstTraversal(Visitor visitor, int start) {
       boolean nodes[] = new boolean[numVert];
        for (int i = 0; i < numVert; i++) {
            nodes[i] = false;
        }
        ArrayList<Queue> queue = new ArrayList();
        nodes[start] = true;
        queue.add((Queue) vertex[start]);
        while(!queue.isEmpty() && !visitor.isDone()){
            Vertex v = (Vertex) queue.poll();
            visitor.visit(v);
            Enumeration p = v.getSuccessors();
            while(p.hasMoreElements()){
                Vertex prox = (Vertex) p.nextElement();
                if(!nodes[prox.getNumber()]){
                    nodes[prox.getNumber()] = true;
                    queue.add((Queue) prox);
                 toString(queue);
                }
            }
        }    
    }

    @Override
    public void breadthFirstTraversal(Visitor visitor) {
        boolean nodes[] = new boolean[numVert];
        for (int i = 0; i < numVert; i++) {
            nodes[i] = false;
        }
        LinkedList<Queue> queue = new LinkedList();
        nodes[vertex[0].getNumber()] = true;
        queue.add((Queue) vertex[0]);
        while(!queue.isEmpty() && !visitor.isDone()){
            Vertex v = (Vertex) queue.poll();
            visitor.visit(v);
            Enumeration p = v.getSuccessors();
            while(p.hasMoreElements()){
                Vertex prox = (Vertex) p.nextElement();
                if(!nodes[prox.getNumber()]){
                    nodes[prox.getNumber()] = true;
                    queue.add((Queue) prox);
                    toSring(queue);
                }
            }
        }
    }
   public String toString(LinkedList<Queue> queue){
     return "aresta:"+queue.toString()+"->";
   }
public String toString(Vertex vertex,Edge edge){
     return"vertice:"+vertex.getVertex()+"aresta:"+edge.getEdge();
   }
