import React, { useContext } from "react";
import { context } from "./User";

function Education() {
  let user = useContext(context);
  return (
    <>
      <h3>Educational Details</h3>
      <p>Degree: {user.Education.degree}</p>
      <p>College: {user.Education.college}</p>
      <p>Year: {user.Education.year}</p>
      <p>Marks: {user.Education.marks}</p>
    </>
  );
}

export default Education;
