// Martha Gómez 19501

public class Vertex<E>
{
    private E label;
    private boolean visited;
    int row;

    /**
     * Constructor
     * @param label Vertice
     */
    public Vertex(E label, int row) {
        this.label = label;
        this.visited = false;
        this.row = row;
    }

    public int row() { return this.row;	}

    public E label() { return this.label; }
}