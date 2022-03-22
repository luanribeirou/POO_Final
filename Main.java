class Main {
  public static void main(String[] args) {
    Graph<Object, Object> g;
    Digraph<String,String> dg;
    g = new GraphAsMatrix(10);
    g.addVertex(1, 20.43);
    System.out.println("Compiled!");
  }
}
