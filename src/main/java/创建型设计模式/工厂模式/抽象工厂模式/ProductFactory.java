package 创建型设计模式.工厂模式.抽象工厂模式;

/**
 * @author torvalds on 2018/10/6 20:53.
 * @version 1.0
 */
public interface ProductFactory {
    public TV produceTV();
    public Controller productController();
}
