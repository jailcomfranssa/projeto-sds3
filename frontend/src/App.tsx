import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py3">Dashboard de vendas</h1>

        <div className="row px-3">
          <div className="col-6">
            <h5 className="text-center text-secondary">Taxas de sucesso(%)</h5>
            <BarChart />
          </div>

          <div className="col-6">
            <h5  className="text-center text-secondary">Todas vendas</h5>
             <DonutChart/>
          </div>

        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas vendas</h2>
        </div>

        <DataTable />
      </div>

      <Footer />
    </>
  );
}

export default App;
