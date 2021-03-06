#!/usr/bin/env bash

git submodule update --init &&
  cd frontend && ./build-and-copy-frontend.sh && cd .. &&
  cd topology && lein install && cd .. &&
  lein sub uberjar &&
  docker-compose -f docker-bank.yml -f docker-prep.yml build --no-cache
