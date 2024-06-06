package stack;

import me.anpeng.stack.LeetCode_232_StackImplementQueue;
import org.junit.Test;

/**
 * @ClassName: StackImplementQueueTest.java
 * @Description:
 * @Author: anpeng
 * @Date: 2024/5/30 21:39
 */
public class StackImplementQueueTest {
    @Test
    public void test(){
        LeetCode_232_StackImplementQueue.StackImplementQueue myQueue =
                new LeetCode_232_StackImplementQueue.StackImplementQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
    }

}
