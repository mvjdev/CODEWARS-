function arrayDiff(a, b) {
  const result = [];

  for (const num of a) {
    let found = false;
    for (const compareNum of b) {
      if (num === compareNum) {
        found = true;
        break;
      }
    }
    if (!found) {
      result.push(num);
    }
  }
  return result;
}//Tableau.diff (enlève un chiffre mentionné)