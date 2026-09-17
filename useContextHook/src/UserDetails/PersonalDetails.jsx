import React, { useContext } from "react";
import User, { context } from "./User";

function PersonalDetails() {
  let user = useContext(context);
  return (
    <>
      <h3>Personal Details</h3>
      <p>ID: {user.id}</p>
      <p>Name: {user.name}</p>
      <p>Email: {user.email}</p>
      <p>Contact: {user.contact}</p>
      <p>Age: {user.age}</p>
      <p>DOB: {user.DOB}</p>
    </>
  );
}

export default PersonalDetails;
