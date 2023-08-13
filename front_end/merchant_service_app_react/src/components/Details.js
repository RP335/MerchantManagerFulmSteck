import React from 'react';
import { Link } from 'react-router-dom';
import { Card } from 'react-bootstrap'; // Import Bootstrap components

export default function Details() {
  return (
    <div>
      <h1 className="mt-4 text-center">Welcome to the Merchant Management Panel</h1>
      <Card className="mt-4 p-4 text-center">
        <p className="mb-3">
          Explore the options to enroll, modify, or delete merchants as needed.
        </p>
        <Link to="/enrollpage" className="btn btn-primary btn-lg btn-rotate">
          Enroll Merchant
        </Link>
      </Card>
    </div>
  );
}
