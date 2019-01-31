package exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Integer.valueOf;

public class Exercise2Test {

    private BinaryTree a;
    private BinaryTree b;
    private BinaryTree c;
    private BinaryTree d;
    private BinaryTree e;
    private BinaryTree f;

    @Before
    public void setUp() {
        a = new BinaryTree();
        a.valor = 1;

        b = new BinaryTree();
        b.valor = 1;

        c = new BinaryTree();
        c.valor = 1;

        d = new BinaryTree();
        d.valor = 1;

        e = new BinaryTree();
        e.valor = 1;

        f = new BinaryTree();
        f.valor = 1;
    }

    @Test
    public void shouldSumSmallTree() {
        a.left = b;

        Exercise2 exercise2 = new Exercise2(a);

        Integer integer = exercise2.sumTree();
        Assert.assertEquals(valueOf(2), integer);
    }

    @Test
    public void shouldSumBigTree() {
        a.left = b;
        a.right = c;

        c.left = d;
        c.right = e;

        e.left=f;

        Exercise2 exercise2 = new Exercise2(a);

        Integer integer = exercise2.sumTree();
        Assert.assertEquals(valueOf(6), integer);
    }
}