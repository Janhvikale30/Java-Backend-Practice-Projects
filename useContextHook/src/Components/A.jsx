import React, { createContext } from "react";
import B from "./B";
export let context = createContext();

function A() {
  let city = "PUNE";
  return (
    <>
      <h1>A Component :{city}</h1>

      <context.Provider value={city}>
        <B />
      </context.Provider>
      {/* <B city={city} /> */}
    </>
  );
}

export default A;
