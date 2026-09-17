import React, { useContext } from "react";
import { context } from "./A";

function C() {
  let city = useContext(context);
  return (
    <>
      <h1>C Component :{city}</h1>
    </>
  );
}

export default C;
