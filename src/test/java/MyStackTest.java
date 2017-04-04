import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by michaelsoza on 4/4/17.
 */


public class MyStackTest {
    private MyStack myStack;

    @Before
    public void InitializeStack(){

        //Arrange
        myStack =new MyStack();
    }

    @Test
    public void StackCouldBeCreatedEmpty() throws Exception{
        Assert.assertNotNull(myStack);
    }

    @Test
    public void whenICreateAnStackTheSizeShouldBeZero(){

        //act
        int result=myStack.getSize();

        //assert
        Assert.assertEquals(0, result);
    }

    @Test
    public void whenICreateAnStackAndInsert2and5TheSizeShouldBe2(){

        //act
        myStack.push(2);
        myStack.push(5);
        int result = myStack.getSize();

        //assert
        Assert.assertEquals(2, result);
    }

    @Test
    public void shouldReturnSameSizeWhenPeek() {

        myStack.push(2);
        myStack.push(3);
        myStack.peek();

        Assert.assertEquals(2, myStack.getSize());

    }

    @Test
    public void whenInsert2And3PeekShouldReturn3() {

        myStack.push(2);
        myStack.push(3);
        int peekValue = myStack.peek();

        Assert.assertEquals(3, peekValue);
    }

    @Test
    public void whenInsert2and3PopShouldReturn3(){
        myStack.push(2);
        myStack.push(3);
        int result =myStack.pop();
        Assert.assertEquals(result, 3);

    }

    @Test
    public void whenInsert2and7PopShouldReturn7(){
        myStack.push(2);
        myStack.push(7);
        int result =myStack.pop();
        Assert.assertEquals(result, 7);

    }

    @Test(expected = StackUnderflowException.class)
    public void whenStackIsEmptyPopShouldThrowException(){
        myStack.pop();
    }
}
