(*
 * This file has been generated by the OCamlClientCodegen generator for openapi-generator.
 *
 * Generated by: https://openapi-generator.tech
 *
 *)

type t = {
    integer: int32 option [@default None];
    int32: int32 option [@default None];
    int64: int64 option [@default None];
    number: float;
    float: float option [@default None];
    double: float option [@default None];
    string: string option [@default None];
    byte: string;
    binary: string option [@default None];
    date: string;
    date_time: string option [@default None];
    uuid: string option [@default None];
    password: string;
    (* A string that is a 10 digit number. Can have leading zeros. *)
    pattern_with_digits: string option [@default None];
    (* A string starting with 'image_' (case insensitive) and one to three digits following i.e. Image_01. *)
    pattern_with_digits_and_delimiter: string option [@default None];
} [@@deriving yojson { strict = false }, show ];;

let create (number : float) (byte : string) (date : string) (password : string) : t = {
    integer = None;
    int32 = None;
    int64 = None;
    number = number;
    float = None;
    double = None;
    string = None;
    byte = byte;
    binary = None;
    date = date;
    date_time = None;
    uuid = None;
    password = password;
    pattern_with_digits = None;
    pattern_with_digits_and_delimiter = None;
}

