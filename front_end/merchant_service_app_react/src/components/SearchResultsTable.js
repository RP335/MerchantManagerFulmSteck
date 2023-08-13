import React from 'react';

const SearchResultsTable = ({ searchResults }) => {
  return (
    <div>
      <h2>Search Results</h2>
      <table className="table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Business Category</th>
          </tr>
        </thead>
        <tbody>
          {searchResults.map(result => (
            <tr key={result.id}>
              <td>{result.merchantId}</td>
              <td>{result.merchantName}</td>
              <td>{result.merchantEmail}</td>
              <td>{result.merchantMobile}</td>
              <td>{result.merchantBusinessCategory}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default SearchResultsTable;
