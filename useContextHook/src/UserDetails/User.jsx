import React, { createContext } from "react";
import PersonalDetails from "./PersonalDetails";
import Education from "./Education";
import Address from "./Address";
export let context = createContext();

function User() {
  let user = {
    id: 12,
    name: "Aman",
    email: "aman123@gmail.com",
    contact: 434567,
    age: 22,
    DOB: "12/09/03",
    Education: {
      degree: "B.tech",
      college: "ABVS College",
      year: 2026,
      marks: 77,
    },
    address: {
      pincode: 44112,
      area: "Sahu Colony",
      city: "nagpur",
      state: "Maharashtra",
    },
  };
  return (
    <>
      <h3>User Details</h3>
      <context.Provider value={user}>
        <PersonalDetails />
        <Education />
        <Address />
      </context.Provider>
    </>
  );
}

export default User;
