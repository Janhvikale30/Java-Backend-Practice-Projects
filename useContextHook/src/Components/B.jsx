import React from "react";
import C from "./C";

function B() {
  return (
    <>
      <h1>B Component</h1>
      <C />
      {/* <h1>B Component :{props.city}</h1> */}
      {/* <C city={props.city} /> */}
    </>
  );
}

export default B;
