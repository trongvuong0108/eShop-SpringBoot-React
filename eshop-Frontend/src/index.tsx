import React from "react";
import ReactDOM from "react-dom/client";
import "./index.css";
import "./Assets/css/main.css";
import "../node_modules/@fortawesome/fontawesome-free/css/all.min.css";
import "./Assets/css/tailwind.css";
import App from "./App";
import { BrowserRouter } from "react-router-dom";
const root = ReactDOM.createRoot(
  document.getElementById("root") as HTMLElement
);
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
  </React.StrictMode>
);
