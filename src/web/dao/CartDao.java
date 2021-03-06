package web.dao;

import java.util.List;

import web.Intermediate.CartItems;
import web.Intermediate.ShowPage;
import web.entity.Cart;
import web.entity.User;
/**对购物车的数据库的各种操作
 * @author 黄信胜
 * @date 2018年11月20日下午8:36:40
 * @version 版本号
 */
public interface CartDao {
		/**
		 * 加入购物车
		 * @param cart 购物车 实体类
		 */
		void addCart(Cart cart);
		
		/**
		 * 查看用户的购物车
		 * @param user 用户实体类
		 * @param currentPage 显示购物车当前页（默认是1）
		 * @param maxResult   每页显示的最大记录数（默认是2）
		 * @return   购物车的集合类
		 */
		List<CartItems> lookCart(User user, Integer currentPage, Integer maxResult);
		
		/**
		 * 检查该用户的购物车是否存在该商品，有数量添加，无添加该商品
		 * @param uid 用户id
		 * @param gid 商品id
		 * @return 返回购物车的集合类
		 */
		List<Cart> checkExistItems(Integer uid, Integer gid);
		
		/**
		 * 删除购物车的商品
		 * @param uid 用户id
		 * @param gid 商品id
		 */
		void deleCart(Integer uid, Integer gid);
		
		/**
		 * 修改购物车后，更新购物车
		 * @param cart
		 */
		void SaveCart(Cart cart);
		
		/**
		 * 统计用户购物车中的商品总数量
		 * @param uid 用户id
		 * @return  购物车商品总数
		 */
		Long countAllCartItems(Integer uid);
		/**
		 * 统计用户在购物车表中的记录数
		 * @param uid 用户id
		 * @return 用户在购物车表中的记录数
		 */
		Long statisticalCarts(Integer uid);
}
