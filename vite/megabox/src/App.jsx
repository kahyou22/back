import "./App.css";
import "./../public/css/reset.css";
import BoxOfficeCard from "./BoxOfficeCard";
import { datas } from "./data";

function App() {
  return (
    <div className="box_office">
      {datas.map((data) => (
        <BoxOfficeCard data={data} key={data} />
      ))}
    </div>
  );
}

export default App;
