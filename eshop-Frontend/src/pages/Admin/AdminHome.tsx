import React from "react";

import AdminNavbar from "../../Components/Admin/Navbars/AdminNavbar";
import Sidebar from "../../Components/Admin/Sidebar/Sidebar";
import HeaderStats from "../../Components/Admin/Headers/HeaderStats";
import FooterAdmin from "../../Components/Admin/Footers/FooterAdmin";
import CardLineChart from "../../Components/Admin/Cards/CardLineChart";
import CardPageVisits from "../../Components/Admin/Cards/CardPageVisits";
import CardSocialTraffic from "../../Components/Admin/Cards/CardSocialTraffic";
import CardBarChart from "../../Components/Admin/Cards/CardBarChart";
export default function AdminHome() {
  return (
    <>
      <Sidebar />
      <div className="relative md:ml-64 bg-blueGray-100">
        <AdminNavbar />
        <HeaderStats />
        <div className="px-4 md:px-10 mx-auto w-full -m-24">
          <div className="flex flex-wrap">
            <div className="w-full xl:w-8/12 mb-12 xl:mb-0 px-4"></div>
            <div className="w-full xl:w-4/12 px-4"></div>
          </div>
          <div className="flex flex-wrap mt-4">
            <div className="w-full xl:w-8/12 mb-12 xl:mb-0 px-4"></div>
            <div className="w-full xl:w-4/12 px-4"></div>
          </div>
          <FooterAdmin />
        </div>
      </div>
    </>
  );
}
