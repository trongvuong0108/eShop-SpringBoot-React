import Cart from "../Pages/Client/Cart";
import CheckOut from "../Pages/Client/CheckOut";
import AdminHome from "../Pages/Admin/AdminHome";
import Home from "../Pages/Client/Home";
import Login from "../Pages/Client/Login";
import ProductDetail from "../Pages/Client/ProductDetail";
import Product from "../Pages/Client/Products";
import Profile from "../Pages/Client/Profile";
import Register from "../Pages/Client/Register";
import AdminProduct from "../Pages/Admin/AdminProduct";
import AdminCategory from "../Pages/Admin/AdminCategory";
import AdminBill from "../Pages/Admin/AdminBill";

export const routes = {
  publicRoutes: [
    { path: "/", component: Home },
    { path: "/product", component: Product },
    { path: "/product/id=:id", component: ProductDetail },
    { path: "/login", component: Login },
    { path: "/register", component: Register },
    { path: "/checkout", component: CheckOut },
    { path: "/cart", component: Cart },
    { path: "/profile", component: Profile },
    { path: "/Admin", component: AdminHome },
    { path: "/Admin/Product", component: AdminProduct },
    { path: "/Admin/Category", component: AdminCategory },
    { path: "/Admin/Bill", component: AdminBill },
  ],
};
