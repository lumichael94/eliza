(ns eliza.memory.schema.model_test
  (:require [clojure.test :refer :all]
            [eliza.memory.schema.model :refer :all])
  (:use clojure.pprint))

(deftest schema-function-test
  (testing "schema-function test"
    (let [hyperarc (atom (->srec "function"))]
      (is (= "function" (:function @hyperarc))))))

(deftest update-schema-function-test
  (testing "update-schema-function test"
    (let [hyperarc (atom (->srec "function"))]
      (swap! hyperarc assoc :function "changed")
      (is (= "changed" (:function @hyperarc))))))