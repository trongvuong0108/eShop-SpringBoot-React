export const priceFormatter = (number: number) => {
  return new Intl.NumberFormat("vi-VN", {
    style: "currency",
    currency: "VND",
  }).format(number);
};

export const dateFormat = (today: Date) => {
  const yyyy = today.getFullYear();
  let mm = today.getMonth() + 1; // Months start at 0!
  let dd = today.getDate();
  let res: string = "";
  if (dd < 10) res += "0" + dd;
  if (mm < 10) res += "0" + mm;
  return res + yyyy;
};
