package trees;

public class Graph <T extends Comparable>{

    private Vertex<T> head;

    public  Vertex<T>findVertex(String id){
        Vertex<T> iterator=head;
        while(iterator!=null){
            if(iterator.id.compareTo(id)==0){
                return iterator;
            }
            iterator=iterator.nextVertex;
        }
        return null;
    }
    public int inDegree(String id){
       return 0;

    }
    public int outDegree(String id){
        Vertex<T> current=findVertex(id);
        int counter=0;
        if(current==null){
            System.out.println("Not exist vertex");
        }else{
            Edge iterator=current.EdgeLink;
            if(iterator==null){
                System.out.println("0 outdegree");
            }else{
                while(iterator!=null){
                    counter++;
                    iterator=iterator.nextEdge;
                }
            }
        }
        return counter;
    }
    public void addVertex(String id){
        if(findVertex(id)==null) {
            if (head == null) {
                head = new Vertex<T>(id);
            }
            Vertex<T> ite = head;
            while (ite.nextVertex != null) {
                ite = ite.nextVertex;
            }
            ite.nextVertex = new Vertex<T>(id);
        }
        System.out.println("exist");

    }
    public void addEdge(String idStart,String idEnd,int weight){
        Vertex<T> start=findVertex(idStart);
        Vertex<T> end=findVertex(idEnd);
        if(start!=null&&end!=null){
            Edge iterator=start.EdgeLink;
            if(iterator==null){
                start.EdgeLink=new Edge(idEnd,weight);
            }else{
                while(iterator.nextEdge!=null){
                    iterator=iterator.nextEdge;
                }
                iterator.nextEdge=new Edge(idEnd,weight);
            }
        }else{
            System.out.println("This edge can not exist");
        }

    }
    //list of neighbors of given vertex

    public void FindNeighbors(String id){
        Vertex<T> current =findVertex(id);
        if(current ==null){
            System.out.println("There is no vertex with that id");
        }else{
            Edge iterator=current.EdgeLink;
            while(iterator!=null){
                System.out.println(iterator.vertexId);
                iterator=iterator.nextEdge;
            }

        }

    }
}
