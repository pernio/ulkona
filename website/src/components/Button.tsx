interface Props {
  text: string;
  onClick?: () => void;
}

export default function Button(props: Props) {
  return (
    <button
      className="rounded bg-blue-500 px-4 py-2 font-bold text-white hover:bg-blue-700 hover:cursor-pointer"
      onClick={props.onClick}
    >
      {props.text}
    </button>
  );
}
