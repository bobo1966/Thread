package UncheckedException;

/**
 * Created by Administrator on 2017/9/21.
 */
public class ExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("An exception has been captured\n");
        System.out.printf("Thread:%s\n",t.getId());
        System.out.printf("Exception:%s:%s\n",e.getClass().getName(),e.getMessage());
    }
}
