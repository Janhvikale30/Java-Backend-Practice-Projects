import React, { useContext } from "react";
import { context } from "./User";

function Address() {
  let user = useContext(context);
  return (
    <>
      <h3>Adress Details</h3>
      <p>Pincode: {user.address.pincode}</p>
      <p>Area: {user.address.area}</p>
      <p>City: {user.address.city}</p>
      <p>State: {user.address.state}</p>
    </>
  );
}

export default Address;
