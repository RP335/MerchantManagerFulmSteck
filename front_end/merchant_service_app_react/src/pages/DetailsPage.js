import React from 'react';
import { Container, Row, Col } from 'react-bootstrap'; // Import Bootstrap components
import Details from '../components/Details';

function DetailsPage() {
  return (
    <Container>
      <h1 className="mt-4">Details Page</h1>
      <Row className="mt-4">
        <Col>
          <Details />
        </Col>
      </Row>
    </Container>
  );
}

export default DetailsPage;
