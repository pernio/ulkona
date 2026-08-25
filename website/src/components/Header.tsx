export default function Header() {
  return (
    <header className="flex flex-row justify-between p-4 w-full">
      <a href="/">
        <h1 className="text-2xl font-bold">Ulkona</h1>
      </a>
      <ul className="flex flex-row gap-4">
        <li>About</li>
      </ul>
    </header>
  );
}
