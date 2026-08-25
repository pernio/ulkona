import Button from "./components/Button";
import Header from "./components/Header";

export default function App() {
  return (
    <main className="flex flex-col min-h-screen items-center">
      <Header />
      <h1 className="text-4xl font-bold">Hello React!</h1>
      <Button text="Click me!" />
    </main>
  );
}
