import { FC } from "react";
import { Routes, Route } from "react-router-dom";
import { routes } from "./routes/routes";

const App: FC = () => {
  return (
    <>
      <Routes>
        {routes.publicRoutes.map((item) => {
          return (
            <Route
              key={Math.random()}
              path={item.path}
              element={<item.component />}
            />
          );
        })}
      </Routes>
    </>
  );
};

export default App;
